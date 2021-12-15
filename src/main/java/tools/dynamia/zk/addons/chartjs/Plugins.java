package tools.dynamia.zk.addons.chartjs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Plugins extends LazyJSONObject {
	@Builder.Default
    private Title title = new Title();
	@Builder.Default
    private Legend legend = new Legend();
	@Builder.Default
    private Tooltips tooltips = new Tooltips();
}
