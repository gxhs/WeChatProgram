package bjwl.pojo.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TconceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TconceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMemidIsNull() {
            addCriterion("memID is null");
            return (Criteria) this;
        }

        public Criteria andMemidIsNotNull() {
            addCriterion("memID is not null");
            return (Criteria) this;
        }

        public Criteria andMemidEqualTo(Integer value) {
            addCriterion("memID =", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotEqualTo(Integer value) {
            addCriterion("memID <>", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidGreaterThan(Integer value) {
            addCriterion("memID >", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memID >=", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidLessThan(Integer value) {
            addCriterion("memID <", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidLessThanOrEqualTo(Integer value) {
            addCriterion("memID <=", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidIn(List<Integer> values) {
            addCriterion("memID in", values, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotIn(List<Integer> values) {
            addCriterion("memID not in", values, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidBetween(Integer value1, Integer value2) {
            addCriterion("memID between", value1, value2, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotBetween(Integer value1, Integer value2) {
            addCriterion("memID not between", value1, value2, "memid");
            return (Criteria) this;
        }

        public Criteria andYhjidIsNull() {
            addCriterion("YHJID is null");
            return (Criteria) this;
        }

        public Criteria andYhjidIsNotNull() {
            addCriterion("YHJID is not null");
            return (Criteria) this;
        }

        public Criteria andYhjidEqualTo(Integer value) {
            addCriterion("YHJID =", value, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidNotEqualTo(Integer value) {
            addCriterion("YHJID <>", value, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidGreaterThan(Integer value) {
            addCriterion("YHJID >", value, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YHJID >=", value, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidLessThan(Integer value) {
            addCriterion("YHJID <", value, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidLessThanOrEqualTo(Integer value) {
            addCriterion("YHJID <=", value, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidIn(List<Integer> values) {
            addCriterion("YHJID in", values, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidNotIn(List<Integer> values) {
            addCriterion("YHJID not in", values, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidBetween(Integer value1, Integer value2) {
            addCriterion("YHJID between", value1, value2, "yhjid");
            return (Criteria) this;
        }

        public Criteria andYhjidNotBetween(Integer value1, Integer value2) {
            addCriterion("YHJID not between", value1, value2, "yhjid");
            return (Criteria) this;
        }

        public Criteria andSendtmIsNull() {
            addCriterion("SendTm is null");
            return (Criteria) this;
        }

        public Criteria andSendtmIsNotNull() {
            addCriterion("SendTm is not null");
            return (Criteria) this;
        }

        public Criteria andSendtmEqualTo(Date value) {
            addCriterion("SendTm =", value, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmNotEqualTo(Date value) {
            addCriterion("SendTm <>", value, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmGreaterThan(Date value) {
            addCriterion("SendTm >", value, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmGreaterThanOrEqualTo(Date value) {
            addCriterion("SendTm >=", value, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmLessThan(Date value) {
            addCriterion("SendTm <", value, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmLessThanOrEqualTo(Date value) {
            addCriterion("SendTm <=", value, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmIn(List<Date> values) {
            addCriterion("SendTm in", values, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmNotIn(List<Date> values) {
            addCriterion("SendTm not in", values, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmBetween(Date value1, Date value2) {
            addCriterion("SendTm between", value1, value2, "sendtm");
            return (Criteria) this;
        }

        public Criteria andSendtmNotBetween(Date value1, Date value2) {
            addCriterion("SendTm not between", value1, value2, "sendtm");
            return (Criteria) this;
        }

        public Criteria andLosetmIsNull() {
            addCriterion("LoseTM is null");
            return (Criteria) this;
        }

        public Criteria andLosetmIsNotNull() {
            addCriterion("LoseTM is not null");
            return (Criteria) this;
        }

        public Criteria andLosetmEqualTo(Date value) {
            addCriterion("LoseTM =", value, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmNotEqualTo(Date value) {
            addCriterion("LoseTM <>", value, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmGreaterThan(Date value) {
            addCriterion("LoseTM >", value, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmGreaterThanOrEqualTo(Date value) {
            addCriterion("LoseTM >=", value, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmLessThan(Date value) {
            addCriterion("LoseTM <", value, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmLessThanOrEqualTo(Date value) {
            addCriterion("LoseTM <=", value, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmIn(List<Date> values) {
            addCriterion("LoseTM in", values, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmNotIn(List<Date> values) {
            addCriterion("LoseTM not in", values, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmBetween(Date value1, Date value2) {
            addCriterion("LoseTM between", value1, value2, "losetm");
            return (Criteria) this;
        }

        public Criteria andLosetmNotBetween(Date value1, Date value2) {
            addCriterion("LoseTM not between", value1, value2, "losetm");
            return (Criteria) this;
        }

        public Criteria andIfloseIsNull() {
            addCriterion("IFLose is null");
            return (Criteria) this;
        }

        public Criteria andIfloseIsNotNull() {
            addCriterion("IFLose is not null");
            return (Criteria) this;
        }

        public Criteria andIfloseEqualTo(Boolean value) {
            addCriterion("IFLose =", value, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseNotEqualTo(Boolean value) {
            addCriterion("IFLose <>", value, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseGreaterThan(Boolean value) {
            addCriterion("IFLose >", value, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IFLose >=", value, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseLessThan(Boolean value) {
            addCriterion("IFLose <", value, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseLessThanOrEqualTo(Boolean value) {
            addCriterion("IFLose <=", value, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseIn(List<Boolean> values) {
            addCriterion("IFLose in", values, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseNotIn(List<Boolean> values) {
            addCriterion("IFLose not in", values, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseBetween(Boolean value1, Boolean value2) {
            addCriterion("IFLose between", value1, value2, "iflose");
            return (Criteria) this;
        }

        public Criteria andIfloseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IFLose not between", value1, value2, "iflose");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}