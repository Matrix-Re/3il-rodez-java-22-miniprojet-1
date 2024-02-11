package fr.ecole3il.rodez2023.perlin.exception;

public class MauvaiseValeurException extends IllegalArgumentException {
    public MauvaiseValeurException(String message) {
        super(message);
    }
}