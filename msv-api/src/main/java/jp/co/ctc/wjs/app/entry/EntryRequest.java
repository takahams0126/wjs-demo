package jp.co.ctc.wjs.app.entry;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * EntryRequestエンティティ.
 */
@Data
@NoArgsConstructor
public class EntryRequest {

    /** ID. */
    private int id;
	
    /** Name. */
    private String name;

}
