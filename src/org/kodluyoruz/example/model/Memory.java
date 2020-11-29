package org.kodluyoruz.example.model;

import org.kodluyoruz.example.model.enums.MemoryEnum;

import java.util.Objects;

public class Memory {

    private int size;
    private MemoryEnum memoryType;

    public Memory(int size, MemoryEnum memoryType) {
        this.size = size;
        this.memoryType = memoryType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MemoryEnum getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryEnum memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memory memory = (Memory) o;
        return size == memory.size &&
                memoryType == memory.memoryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, memoryType);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                ", memoryType=" + memoryType +
                '}';
    }
}
