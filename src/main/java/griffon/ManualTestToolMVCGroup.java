package griffon;

import javax.inject.Named;
import griffon.core.mvc.MVCGroup;
import org.codehaus.griffon.runtime.core.mvc.AbstractTypedMVCGroup;
import javax.annotation.Nonnull;

@Named("manualTestTool")
public class ManualTestToolMVCGroup extends AbstractTypedMVCGroup<ManualTestToolModel, ManualTestToolView, ManualTestToolController> {
    public ManualTestToolMVCGroup(@Nonnull MVCGroup delegate) {
        super(delegate);
    }
}