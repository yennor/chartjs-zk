package tools.dynamia.zk.addons.chartjs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@lombok.Builder
/*
 * https://www.chartjs.org/docs/3.6.0/axes/cartesian/time.html
 */
public class Time extends LazyJSONObject {
    private String unit;
    private String minUnit;
    private String toolTipFormat;
    private TimeDisplayFormats displayFormats;
}

