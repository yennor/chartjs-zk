package tools.dynamia.zk.addons.chartjs;

/**
 * The tick configuration is nested under the scale configuration in the ticks property.
 * It defines options for the tick marks that are generated by the axis.
 */
public class Ticks extends LazyJSONObject {

    private Boolean display ;
    private String fontColor;
    private String fontFamily;
    private Integer fontSize;
    private String fontStyle;
    private Boolean reverse;

    // TODO: everything here seems to have moved
   private Boolean beginAtZero;
   private Integer min;
   private Integer max;
   private Integer maxTicksLimit;
   private Double stepSize;
   private Integer suggestedMax;
   private Integer suggestedMin;

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public Boolean getReverse() {
        return reverse;
    }

    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    public Boolean getBeginAtZero() {
        return beginAtZero;
    }

    public void setBeginAtZero(Boolean beginAtZero) {
        this.beginAtZero = beginAtZero;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMaxTicksLimit() {
        return maxTicksLimit;
    }

    public void setMaxTicksLimit(Integer maxTicksLimit) {
        this.maxTicksLimit = maxTicksLimit;
    }

    public Double getStepSize() {
        return stepSize;
    }

    public void setStepSize(Double stepSize) {
        this.stepSize = stepSize;
    }

    public Integer getSuggestedMax() {
        return suggestedMax;
    }

    public void setSuggestedMax(Integer suggestedMax) {
        this.suggestedMax = suggestedMax;
    }

    public Integer getSuggestedMin() {
        return suggestedMin;
    }

    public void setSuggestedMin(Integer suggestedMin) {
        this.suggestedMin = suggestedMin;
    }


    public static final class Builder {
        private Boolean display ;
        private String fontColor;
        private String fontFamily;
        private Integer fontSize;
        private String fontStyle;
        private Boolean reverse;
        private Boolean beginAtZero;
        private Integer min;
        private Integer max;
        private Integer maxTicksLimit;
        private Double stepSize;
        private Integer suggestedMax;
        private Integer suggestedMin;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder display(Boolean display) {
            this.display = display;
            return this;
        }

        public Builder fontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }

        public Builder fontFamily(String fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }

        public Builder fontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Builder fontStyle(String fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }

        public Builder reverse(Boolean reverse) {
            this.reverse = reverse;
            return this;
        }

        public Builder beginAtZero(Boolean beginAtZero) {
            this.beginAtZero = beginAtZero;
            return this;
        }

        public Builder min(Integer min) {
            this.min = min;
            return this;
        }

        public Builder max(Integer max) {
            this.max = max;
            return this;
        }

        public Builder maxTicksLimit(Integer maxTicksLimit) {
            this.maxTicksLimit = maxTicksLimit;
            return this;
        }

        public Builder stepSize(Double stepSize) {
            this.stepSize = stepSize;
            return this;
        }

        public Builder suggestedMax(Integer suggestedMax) {
            this.suggestedMax = suggestedMax;
            return this;
        }

        public Builder suggestedMin(Integer suggestedMin) {
            this.suggestedMin = suggestedMin;
            return this;
        }

        public Ticks build() {
            Ticks tick = new Ticks();
            tick.setDisplay(display);
            tick.setFontColor(fontColor);
            tick.setFontFamily(fontFamily);
            tick.setFontSize(fontSize);
            tick.setFontStyle(fontStyle);
            tick.setReverse(reverse);
            tick.setBeginAtZero(beginAtZero);
            tick.setMin(min);
            tick.setMax(max);
            tick.setMaxTicksLimit(maxTicksLimit);
            tick.setStepSize(stepSize);
            tick.setSuggestedMax(suggestedMax);
            tick.setSuggestedMin(suggestedMin);
            return tick;
        }
    }
}
