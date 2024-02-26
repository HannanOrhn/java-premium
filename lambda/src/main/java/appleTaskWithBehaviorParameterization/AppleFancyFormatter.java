package appleTaskWithBehaviorParameterization;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        return "A " + (apple.getWeight()>150?"Heavy" : "Light")+ " and " + apple.getColor() + " apple";
    }
}
