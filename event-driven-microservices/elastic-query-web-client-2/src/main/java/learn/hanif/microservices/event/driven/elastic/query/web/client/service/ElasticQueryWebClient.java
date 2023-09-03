package learn.hanif.microservices.event.driven.elastic.query.web.client.service;


import learn.hanif.microservices.event.driven.elastic.query.web.client.common.model.ElasticQueryWebClientRequestModel;
import learn.hanif.microservices.event.driven.elastic.query.web.client.common.model.ElasticQueryWebClientResponseModel;

import java.util.List;

public interface ElasticQueryWebClient {

    List<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel requestModel);
}
