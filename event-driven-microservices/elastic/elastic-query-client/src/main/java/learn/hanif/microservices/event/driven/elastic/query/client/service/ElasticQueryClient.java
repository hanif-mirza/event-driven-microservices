package learn.hanif.microservices.event.driven.elastic.query.client.service;

import learn.hanif.microservices.event.driven.elastic.model.index.IndexModel;

import java.util.List;

public interface ElasticQueryClient<T extends IndexModel> {

    T getIndexModelById(String id);

    List<T> getIndexModelByText(String text);

    List<T> getAllIndexModels();
}
