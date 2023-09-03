package learn.hanif.microservices.event.driven.reactive.elastic.query.service.business;

import learn.hanif.microservices.event.driven.elastic.query.service.common.model.ElasticQueryServiceResponseModel;
import reactor.core.publisher.Flux;

public interface ElasticQueryService {

    Flux<ElasticQueryServiceResponseModel> getDocumentByText(String text);
}
