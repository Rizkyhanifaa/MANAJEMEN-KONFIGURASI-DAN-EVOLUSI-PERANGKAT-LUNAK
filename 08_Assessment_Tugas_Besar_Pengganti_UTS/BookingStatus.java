public enum BookingStatus {
    ACTIVE,
    CANCELLED,
    PENDING;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
