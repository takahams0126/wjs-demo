package jp.co.ctc.wjs.app.entry;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RegistResponseエンティティ.
 */
@Data
@NoArgsConstructor
public class EntryResponse {

    /** ステータス. */
    private String status;

    /** ID. */
    private int id;

    /** Name. */
    private String name;

}
