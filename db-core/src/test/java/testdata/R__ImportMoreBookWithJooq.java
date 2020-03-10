package testdata;

import static org.jooq.impl.DSL.using;

import java.time.LocalDate;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;

import jp.co.ctc.wjs.infra.common.jooq.tables.JItem;
import jp.co.ctc.wjs.infra.common.jooq.tables.records.ItemRecord;

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

        DSLContext dslContext = using(context.getConnection(), SQLDialect.MYSQL);

        final LocalDate baseDate = LocalDate.of(2020, 1, 1);

        for (int i = 1; i <= 10; i++) {

            final LocalDate publishDate = baseDate.plusDays(i);
            final JItem jItem = JItem.ITEM;

            final ItemRecord rec = dslContext.newRecord(jItem);
            rec.setId(i);
            rec.setName("たこやき" + i);
            // rec.setCreatedAt(publishDate);
            rec.store();
        }
    }
}
