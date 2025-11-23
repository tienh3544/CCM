package nhom12.uth.ccm.mapper;

import javax.annotation.processing.Generated;
import nhom12.uth.ccm.dto.response.CarbonSavingResponse;
import nhom12.uth.ccm.model.CarbonSaving;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-24T02:33:16+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class CarbonSavingMapperImpl implements CarbonSavingMapper {

    @Override
    public CarbonSavingResponse toResponse(CarbonSaving carbonSaving) {
        if ( carbonSaving == null ) {
            return null;
        }

        CarbonSavingResponse.CarbonSavingResponseBuilder carbonSavingResponse = CarbonSavingResponse.builder();

        carbonSavingResponse.calculationMethod( carbonSaving.getCalculationMethod() );
        carbonSavingResponse.co2SavedKg( carbonSaving.getCo2SavedKg() );
        carbonSavingResponse.createdAt( carbonSaving.getCreatedAt() );
        carbonSavingResponse.distanceKm( carbonSaving.getDistanceKm() );
        carbonSavingResponse.recordedDate( carbonSaving.getRecordedDate() );
        carbonSavingResponse.savingId( carbonSaving.getSavingId() );

        return carbonSavingResponse.build();
    }
}
