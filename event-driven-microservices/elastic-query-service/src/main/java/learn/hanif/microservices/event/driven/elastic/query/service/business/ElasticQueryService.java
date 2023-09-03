package learn.hanif.microservices.event.driven.elastic.query.service.business;

import learn.hanif.microservices.event.driven.elastic.query.service.common.model.ElasticQueryServiceResponseModel;
import learn.hanif.microservices.event.driven.elastic.query.service.model.ElasticQueryServiceAnalyticsResponseModel;

import java.util.List;

public interface ElasticQueryService {

    ElasticQueryServiceResponseModel getDocumentById(String id);

    ElasticQueryServiceAnalyticsResponseModel getDocumentByText(String text, String accessToken);

    List<ElasticQueryServiceResponseModel> getAllDocuments();
}
