package com.valber.fan.pokedex.model;

public class PokemonEvent {
    private Long eventId;
    private String eventType;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PokemonEvent that = (PokemonEvent) o;

        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null) return false;
        return eventType != null ? eventType.equals(that.eventType) : that.eventType == null;
    }

    @Override
    public int hashCode() {
        int result = eventId != null ? eventId.hashCode() : 0;
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PokemonEvent{" +
                "eventId=" + eventId +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    public PokemonEvent() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public PokemonEvent(Long eventId, String eventType) {
        this.eventId = eventId;
        this.eventType = eventType;
    }
}
