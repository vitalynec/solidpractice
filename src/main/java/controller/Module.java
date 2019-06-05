package controller;

import io.*;
import service.*;

public class Module {

    private IData data;
    private IService service;

    public Module(IData data, IService service) {
        this.data = data;
        this.service = service;
    }

    public void execute() {
        Controller controller = new Controller();
        controller.init(data);
        controller.calc(service);
        controller.done(data);
    }
}
