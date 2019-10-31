package modul_4.aggregationAndComposition.task_2.entity;

import java.util.Objects;

public class Engine {

    private String motor;

    public Engine(String motor) {
        this.motor = motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor () {
        return motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return motor.equals(engine.motor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(motor);
    }
    @Override
    public String toString() {
        return motor;
    }
}
