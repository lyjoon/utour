import Vue from 'vue';
import moment from 'moment'

Vue.filter('mmss', function (value) {
    if (!value) return '00:00';
    return moment.utc(moment.duration(value, "seconds").asMilliseconds()).format("mm:ss")
})

/*
Vue.filter('birthdayFormat', function(value) {
    if(!value) return '';
    return  value.toString().replace(/\B(?=(\d{3})+(?!\d))/g, '-');
})
*/

Vue.filter('YYYYMMDD', function(value) {
    if(!value) return '';
    return  moment(value).format('YYYY-MM-DD');
})

Vue.filter('phoneFormat', function(num) {
    if (num.length == 11) {
        return num.replace(/(\d{3})(\d{4})(\d{4})/, '$1-$2-$3');
    } else if (num.length == 8) {
        return num.replace(/(\d{4})(\d{4})/, '$1-$2');
    } else {
        if (num.indexOf('02') == 0) {
            return num.replace(/(\d{2})(\d{4})(\d{4})/, '$1-$2-$3');
        } else {
            return num.replace(/(\d{3})(\d{3})(\d{4})/, '$1-$2-$3');
        }
    }
})
