package learn.hanif.microservices.event.driven.reactive.elastic.query.service.business.impl;

import learn.hanif.microservices.event.driven.config.ElasticQueryServiceConfigData;
import learn.hanif.microservices.event.driven.elastic.model.index.impl.TwitterIndexModel;
import learn.hanif.microservices.event.driven.reactive.elastic.query.service.business.ReactiveElasticQueryClient;
import learn.hanif.microservices.event.driven.reactive.elastic.query.service.repository.ElasticQueryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class TwitterReactiveElasticQueryClient implements ReactiveElasticQueryClient<TwitterIndexModel> {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterReactiveElasticQueryClient.class);

    private final ElasticQueryRepository elasticQueryRepository;

    private final ElasticQueryServiceConfigData elasticQueryServiceConfigData;

    public TwitterReactiveElasticQueryClient(ElasticQueryRepository elasticRepository,
                                             ElasticQueryServiceConfigData configData) {
        this.elasticQueryRepository = elasticRepository;
        this.elasticQueryServiceConfigData = configData;
    }


    @Override
    public Flux<TwitterIndexModel> getIndexModelByText(String text) {
        LOG.info("Getting data from elasticsearch for text {}", text);
        return elasticQueryRepository
                .findByText(text)
                .delayElements(Duration.ofMillis(elasticQueryServiceConfigData.getBackPressureDelayMs()));
    }
}
