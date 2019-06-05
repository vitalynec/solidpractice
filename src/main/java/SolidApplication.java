import controller.*;
import io.*;
import service.*;

import java.util.Scanner;

public class SolidApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterConsole();
        IData data = new Data(reader, printer);
//        IService service = new ServiceAdd();
        IService service = new ServicePower();
        Module module = new Module(data, service);
        module.execute();
    }
}