package service;

public class ServicePower implements IService {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
