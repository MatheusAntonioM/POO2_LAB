public class Pavao implements Ave {
    @Override
    public void voar() {
        System.out.println("O pavão não pode voar.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pavão está cantando!");
    }
}
