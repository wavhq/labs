package ru.mirea.lab22.task3;

public class CreateImageDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new ImageDocument();
    }
}
