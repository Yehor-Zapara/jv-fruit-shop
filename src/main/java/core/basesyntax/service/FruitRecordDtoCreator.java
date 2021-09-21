package core.basesyntax.service;

import core.basesyntax.model.FruitRecordDto;
import java.util.List;

public interface FruitRecordDtoCreator {
    List<FruitRecordDto> parseRecords(String fileName);
}