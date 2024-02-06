package org.banker.loan.exception.Serializer;

import io.quarkus.kafka.client.serialization.ObjectMapperSerializer;
import org.banker.loan.models.KafkaResponseDto;

public class KafkaRequestSerializer extends ObjectMapperSerializer<KafkaResponseDto> {
    public KafkaRequestSerializer() {
        super();
    }
}