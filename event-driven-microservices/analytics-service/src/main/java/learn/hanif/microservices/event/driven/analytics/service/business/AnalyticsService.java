package learn.hanif.microservices.event.driven.analytics.service.business;

import learn.hanif.microservices.event.driven.analytics.service.model.AnalyticsResponseModel;

import java.util.Optional;

public interface AnalyticsService {

    Optional<AnalyticsResponseModel> getWordAnalytics(String word);
}

