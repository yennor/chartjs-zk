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
public class Title extends LazyJSONObject {
	@Builder.Default
    private boolean display = false;
    private String text;
}
