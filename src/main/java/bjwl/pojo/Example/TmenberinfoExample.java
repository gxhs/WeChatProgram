package bjwl.pojo.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmenberinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmenberinfoExample() {
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

        public Criteria andMemnameIsNull() {
            addCriterion("memName is null");
            return (Criteria) this;
        }

        public Criteria andMemnameIsNotNull() {
            addCriterion("memName is not null");
            return (Criteria) this;
        }

        public Criteria andMemnameEqualTo(String value) {
            addCriterion("memName =", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotEqualTo(String value) {
            addCriterion("memName <>", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameGreaterThan(String value) {
            addCriterion("memName >", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameGreaterThanOrEqualTo(String value) {
            addCriterion("memName >=", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameLessThan(String value) {
            addCriterion("memName <", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameLessThanOrEqualTo(String value) {
            addCriterion("memName <=", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameLike(String value) {
            addCriterion("memName like", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotLike(String value) {
            addCriterion("memName not like", value, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameIn(List<String> values) {
            addCriterion("memName in", values, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotIn(List<String> values) {
            addCriterion("memName not in", values, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameBetween(String value1, String value2) {
            addCriterion("memName between", value1, value2, "memname");
            return (Criteria) this;
        }

        public Criteria andMemnameNotBetween(String value1, String value2) {
            addCriterion("memName not between", value1, value2, "memname");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("PhoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("PhoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("PhoneNum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("PhoneNum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("PhoneNum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("PhoneNum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("PhoneNum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("PhoneNum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("PhoneNum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("PhoneNum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("PhoneNum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("PhoneNum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("PhoneNum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("PhoneNum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andWxnoIsNull() {
            addCriterion("WXNo is null");
            return (Criteria) this;
        }

        public Criteria andWxnoIsNotNull() {
            addCriterion("WXNo is not null");
            return (Criteria) this;
        }

        public Criteria andWxnoEqualTo(String value) {
            addCriterion("WXNo =", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoNotEqualTo(String value) {
            addCriterion("WXNo <>", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoGreaterThan(String value) {
            addCriterion("WXNo >", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoGreaterThanOrEqualTo(String value) {
            addCriterion("WXNo >=", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoLessThan(String value) {
            addCriterion("WXNo <", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoLessThanOrEqualTo(String value) {
            addCriterion("WXNo <=", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoLike(String value) {
            addCriterion("WXNo like", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoNotLike(String value) {
            addCriterion("WXNo not like", value, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoIn(List<String> values) {
            addCriterion("WXNo in", values, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoNotIn(List<String> values) {
            addCriterion("WXNo not in", values, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoBetween(String value1, String value2) {
            addCriterion("WXNo between", value1, value2, "wxno");
            return (Criteria) this;
        }

        public Criteria andWxnoNotBetween(String value1, String value2) {
            addCriterion("WXNo not between", value1, value2, "wxno");
            return (Criteria) this;
        }

        public Criteria andRegtmIsNull() {
            addCriterion("RegTM is null");
            return (Criteria) this;
        }

        public Criteria andRegtmIsNotNull() {
            addCriterion("RegTM is not null");
            return (Criteria) this;
        }

        public Criteria andRegtmEqualTo(Date value) {
            addCriterion("RegTM =", value, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmNotEqualTo(Date value) {
            addCriterion("RegTM <>", value, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmGreaterThan(Date value) {
            addCriterion("RegTM >", value, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmGreaterThanOrEqualTo(Date value) {
            addCriterion("RegTM >=", value, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmLessThan(Date value) {
            addCriterion("RegTM <", value, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmLessThanOrEqualTo(Date value) {
            addCriterion("RegTM <=", value, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmIn(List<Date> values) {
            addCriterion("RegTM in", values, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmNotIn(List<Date> values) {
            addCriterion("RegTM not in", values, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmBetween(Date value1, Date value2) {
            addCriterion("RegTM between", value1, value2, "regtm");
            return (Criteria) this;
        }

        public Criteria andRegtmNotBetween(Date value1, Date value2) {
            addCriterion("RegTM not between", value1, value2, "regtm");
            return (Criteria) this;
        }

        public Criteria andRecomidIsNull() {
            addCriterion("recomID is null");
            return (Criteria) this;
        }

        public Criteria andRecomidIsNotNull() {
            addCriterion("recomID is not null");
            return (Criteria) this;
        }

        public Criteria andRecomidEqualTo(Integer value) {
            addCriterion("recomID =", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotEqualTo(Integer value) {
            addCriterion("recomID <>", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThan(Integer value) {
            addCriterion("recomID >", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recomID >=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThan(Integer value) {
            addCriterion("recomID <", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThanOrEqualTo(Integer value) {
            addCriterion("recomID <=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidIn(List<Integer> values) {
            addCriterion("recomID in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotIn(List<Integer> values) {
            addCriterion("recomID not in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidBetween(Integer value1, Integer value2) {
            addCriterion("recomID between", value1, value2, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotBetween(Integer value1, Integer value2) {
            addCriterion("recomID not between", value1, value2, "recomid");
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