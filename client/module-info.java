module clientModule {
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpasyncclient;
    requires org.apache.httpcomponents.httpcore-nio;
    requires commons-codec.commons-codec;
    requires commons-logging.commons-logging;
    requires org.apache.commons.commons-math3;
    requires org.elasticsearch.client.elasticsearch-rest-client;
    requires org.elasticsearch.elasticsearch;
    requires org.elasticsearch.client.elasticsearch-rest-client;
    requires org.elasticsearch.plugin.parent-join-client;
    requires org.elasticsearch.plugin.aggs-matrix-stats-client;
    requires org.elasticsearch.plugin.rank-eval-client;
    requires org.elasticsearch.plugin.lang-mustache-client;
}
