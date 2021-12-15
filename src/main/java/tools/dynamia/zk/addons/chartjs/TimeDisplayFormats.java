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
 * https://www.chartjs.org/docs/3.6.0/axes/cartesian/time.html#display-formats
 */
public class TimeDisplayFormats extends LazyJSONObject {
    private String millisecond;
    private String second;
    private String minute;
    private String hour;
    private String day;
    private String week;
    private String month;
    private String quarter;
    private String year;
}

