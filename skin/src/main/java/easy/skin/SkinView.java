package easy.skin;

import android.view.View;

import java.lang.ref.SoftReference;
import java.util.List;

import easy.skin.attr.SkinAttr;
import easy.skin.util.SkinUtil;

/**
 * Created by Lucio on 17/3/31.
 */

public class SkinView {

    SoftReference<View> viewRef;
    //    View view;
    List<SkinAttr> attrs;

    public SkinView(View view, List<SkinAttr> skinAttrs) {
        this.viewRef = new SoftReference<View>(view);
        this.attrs = skinAttrs;
    }

    /**
     * @return true:更改了属性
     * false:没有更改属性
     */
    public boolean apply() {
        View view = viewRef.get();
        if(view == null || SkinUtil.isNullOrEmpty(attrs))
            return false;

        boolean result = false;


        for (SkinAttr attr : attrs) {
            if (attr.apply(view)) {
                result = true;
            }
        }
        return result;
    }
}



