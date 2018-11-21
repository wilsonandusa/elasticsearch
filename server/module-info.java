module serverModule {
    requires java.logging;
    requires org.apache.*;
    requires org.elasticsearch.elasticsearch-cli;

    exports org.elasticsearch.server.cli;
}
