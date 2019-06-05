package io;

public class Data implements IData {

    private IReader reader;
    private IPrinter printer;

    public Data (IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void print(String text) {
        printer.print(text);
    }

    public void print(int num) {
        printer.print(num);
    }

    public int read() {
        return reader.read();
    }
}
