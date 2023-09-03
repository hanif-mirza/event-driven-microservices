package learn.hanif.microservices.event.driven.reactive.elastic.query.web.client.service;

import learn.hanif.microservices.event.driven.elastic.query.web.client.common.model.ElasticQueryWebClientRequestModel;
import learn.hanif.microservices.event.driven.elastic.query.web.client.common.model.ElasticQueryWebClientResponseModel;
import reactor.core.publisher.Flux;

public interface ElasticQueryWebClient {

    Flux<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel request);
}
