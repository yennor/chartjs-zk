/*
 * Copyright 2016 Mario Serrano Leones.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tools.dynamia.zk.addons.chartjs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mario Serrano Leones
 */
@Getter @Setter
@Builder
@AllArgsConstructor
public class ChartjsOptions extends LazyJSONObject {

    @Builder.Default
    private boolean responsive = true;
    @Builder.Default
    private boolean maintainAspectRatio = true;

    @Builder.Default
    private Scales scales = new Scales();
    @Builder.Default
    private Plugins plugins = new Plugins();
    @Builder.Default
    private Tooltips tooltips = new Tooltips();

    // TODO: the whole option structure of chart js is a desaster
    // => provide a builder to at least easily create general options with titles, etc.
	public ChartjsOptions() {
		scales = new Scales();
		plugins = new Plugins();
		tooltips = new Tooltips();
		init();
	}
}
