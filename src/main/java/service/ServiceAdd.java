package service;

public class ServiceAdd implements IService {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}