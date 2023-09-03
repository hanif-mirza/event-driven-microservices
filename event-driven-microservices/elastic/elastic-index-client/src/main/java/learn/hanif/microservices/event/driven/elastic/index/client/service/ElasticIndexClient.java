package learn.hanif.microservices.event.driven.elastic.index.client.service;

import learn.hanif.microservices.event.driven.elastic.model.index.IndexModel;

import java.util.List;

public interface ElasticIndexClient<T extends IndexModel> {
    List<String> save(List<T> documents);
}
