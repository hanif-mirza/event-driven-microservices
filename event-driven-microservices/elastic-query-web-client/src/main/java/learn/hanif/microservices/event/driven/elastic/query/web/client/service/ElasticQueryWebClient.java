package learn.hanif.microservices.event.driven.elastic.query.web.client.service;


import learn.hanif.microservices.event.driven.elastic.query.web.client.common.model.ElasticQueryWebClientAnalyticsResponseModel;
import learn.hanif.microservices.event.driven.elastic.query.web.client.common.model.ElasticQueryWebClientRequestModel;

public interface ElasticQueryWebClient {

    ElasticQueryWebClientAnalyticsResponseModel getDataByText(ElasticQueryWebClientRequestModel requestModel);
}
