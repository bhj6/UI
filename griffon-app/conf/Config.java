import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "UI")
                .e("startupGroups", asList("manualTestTool"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("manualTestTool", map()
                    .e("model", "griffon.ManualTestToolModel")
                    .e("view", "griffon.ManualTestToolView")
                    .e("controller", "griffon.ManualTestToolController")
                )
            );
    }
}