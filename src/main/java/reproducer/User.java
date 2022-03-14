package reproducer;

import java.time.OffsetDateTime;
import java.util.Map;

public class User {

    private OffsetDateTime offsetDateTime;

    private Map<String, OffsetDateTime> mapWithOffsetDateTime;

    private Map<String, OffsetDateTime> getMapWithOffsetDateTime() {
        return mapWithOffsetDateTime;
    }

    private void setMapWithOffsetDateTime(Map<String, OffsetDateTime> mapWithOffsetDateTime) {
        this.mapWithOffsetDateTime = mapWithOffsetDateTime;
    }

    private OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    private void setOffsetDateTime(OffsetDateTime offsetDateTime) {
        this.offsetDateTime = offsetDateTime;
    }

}
