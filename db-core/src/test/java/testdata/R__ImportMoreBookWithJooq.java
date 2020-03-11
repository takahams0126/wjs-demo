package testdata;

import java.time.LocalDateTime;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import jp.co.ctc.wjs.infra.common.jooq.tables.JEntry;
import jp.co.ctc.wjs.infra.common.jooq.tables.records.EntryRecord;


/**
 * JOOQを使ってテストデータを投入します.
 */
public class R__ImportMoreBookWithJooq extends BaseJavaMigration {

    /**
     * テストデータを投入します.
     *
     * @context flyway実行コンテキスト
     */
    @Override
    public void migrate(final Context context) throws Exception {

        DSLContext dslContext = DSL.using(context.getConnection(), SQLDialect.MYSQL);

        final LocalDateTime baseDate = LocalDateTime.of(2020, 1, 1, 0, 0);

        for (int i = 1; i <= 10; i++) {

            final LocalDateTime publishDate = baseDate.plusDays(i);
            final JEntry jEntry = JEntry.ENTRY;

            final EntryRecord rec = dslContext.newRecord(jEntry);
            rec.setId(i);
            rec.setName("たこやき" + i);
            rec.setCreatedAt(publishDate);
            rec.setUpdatedAt(publishDate);
            rec.store();
        }
    }
}
