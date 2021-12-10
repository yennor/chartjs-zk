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

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Mario Serrano Leones
 */
@Getter @Setter
public class ChartjsOptions extends LazyJSONObject {

    private String title;
    private boolean responsive = true;
    private boolean maintainAspectRatio = true;
    private Scales scales;
    private Legend legend;
    private Tooltips tooltips;

    @Override
    public void init() {
        super.init();
        if (title != null) {
            Map<String, Object> titleMap = new HashMap<String, Object>();
            titleMap.put("text", title);
            titleMap.put("display", true);
            put("title", titleMap);
        }
        put("responsive", responsive);
        put("maintainAspectRatio", maintainAspectRatio);

        if (scales != null) {
            scales.init();
            put("scales", scales);
        }
    }


    public static final class Builder {
        private String title;
        private boolean responsive = true;
        private Scales scales;
        private Legend legend;
        private Tooltips tooltips;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder responsive(boolean responsive) {
            this.responsive = responsive;
            return this;
        }

        public Builder scales(Scales scales) {
            this.scales = scales;
            return this;
        }

        public Builder legend(Legend legend) {
            this.legend = legend;
            return this;
        }

        public Builder tooltips(Tooltips tooltips) {
            this.tooltips = tooltips;
            return this;
        }

        public ChartjsOptions build() {
            ChartjsOptions chartjsOptions = new ChartjsOptions();
            chartjsOptions.setTitle(title);
            chartjsOptions.setResponsive(responsive);
            chartjsOptions.setScales(scales);
            chartjsOptions.setLegend(legend);
            chartjsOptions.setTooltips(tooltips);
            chartjsOptions.init();
            return chartjsOptions;
        }
    }
}
