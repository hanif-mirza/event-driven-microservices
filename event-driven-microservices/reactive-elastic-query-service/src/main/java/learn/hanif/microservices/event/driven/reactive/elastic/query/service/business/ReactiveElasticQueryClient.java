package learn.hanif.microservices.event.driven.reactive.elastic.query.service.business;

import learn.hanif.microservices.event.driven.elastic.model.index.IndexModel;
import learn.hanif.microservices.event.driven.elastic.model.index.impl.TwitterIndexModel;
import reactor.core.publisher.Flux;

public interface ReactiveElasticQueryClient<T extends IndexModel> {

    Flux<TwitterIndexModel> getIndexModelByText(String text);
}
