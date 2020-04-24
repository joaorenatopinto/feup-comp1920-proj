public class SemanticProcessor {
    public SemanticProcessor(SimpleNode root) {
        root.preProcess(null);
        root.process();
    }
}