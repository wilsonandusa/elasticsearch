module serverModule {
    requires java.logging;
    requires org.apache.*;
    requires org.elasticsearch.elasticsearch-cli;
    requires org.elasticsearch.elasticsearch-core;
    requires org.elasticsearch:elasticsearch-secure-sm;
    requires org.apache.lucene.*;

    exports org.elasticsearch.server.cli;
}
