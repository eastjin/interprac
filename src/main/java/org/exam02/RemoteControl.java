package org.exam02;

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //바디를 생성하려 그러면 인터페이스에서는 생성할 수 없다고 에러 발생함.
    //errorcode//public void test(){};
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
