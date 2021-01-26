<template>
    <div>
      <v-row class="hidden-sm-and-down">
          <v-col class="col-md-6 col-sm-12 col-12" >
            <v-card tile outlined>
              <v-toolbar color="grey darken-2" dark dense tile flat>
                <div>문의하기</div>
                <v-spacer />
                <v-btn icon>
                  <v-icon>mdi-more</v-icon>
                </v-btn>
              </v-toolbar>
              <v-sheet elevation="0" tile class="pa-2 mt-2" >
                <v-form class="pa-2">
                  <v-text-field counter maxlength="20" v-model="name" outlined dense placeholder="문의하실분 성함을 작성해주세요." label="이름" />
                  <v-text-field counter maxlength="13" v-model="phoneNumber" outlined dense placeholder="연락받으실 연락처를 작성해주세요" label="연락처" @keyup="phoneFormatter()" />
                  <v-text-field counter maxlength="100" v-model="phoneNumber" outlined dense placeholder="문의답변을 받으실 E-mail 주소를 작성해주세요" label="E-Mail" />
                  <v-textarea rows="7" v-model="content" no-resize counter maxlength="2000" label="문의내용" outlined dense placeholder="문의하실 내용을 입력해주시기 바랍니다:)"></v-textarea>
                </v-form>
              </v-sheet>

            </v-card>

          </v-col>

          <v-col class="col-md-6 col-sm-12 col-12">
            <v-card tile outlined>
              <v-toolbar color="pink darken-2"  dark dense tile flat>
                <div>공지사항</div>
                <v-spacer />
                <v-btn icon>
                  <v-icon>mdi-more</v-icon>
                </v-btn>
              </v-toolbar>
              <v-list class="mt-2 pa-1" >
                <v-list-item v-for="(item,i) in notice"
                             :key="i" class="pa-0" :style="i != (notice.length - 1) ? 'border-bottom: 1px solid #eaeaea' :''">
                             <v-card tile elevation="0">
                  <v-card-title class="body-1">{{item.title}}</v-card-title>
                  <v-card-text class="text-truncate body-2" >{{item.content}}</v-card-text>
                             </v-card>

                </v-list-item>
              </v-list>

            </v-card>
          </v-col>
      </v-row>

      <div class="hidden-md-and-up">
        <v-sheet>
          <v-tabs fixed-tabs v-model="smTab">
            <v-tab>문의하기</v-tab>
            <v-tab>공지사항</v-tab>
          </v-tabs>
          <v-tabs-items v-model="smTab" class="mt-2">
            <v-tab-item>
              <v-card tile>
                <v-sheet height="400" elevation="0" tile class="pa-2 mt-2" >
                  <v-form class="pa-2">
                    <v-text-field counter maxlength="20" v-model="name" outlined dense placeholder="문의하실분 성함을 작성해주세요." label="이름" />
                    <v-text-field counter maxlength="13" v-model="phoneNumber" outlined dense placeholder="연락받으실 연락처를 작성해주세요" label="연락처" @keyup="phoneFormatter()" />
                    <v-textarea rows="7" v-model="content" no-resize counter maxlength="2000" label="문의내용" outlined dense placeholder="문의하실 내용을 입력해주시기 바랍니다:)"></v-textarea>
                  </v-form>
                </v-sheet>

              </v-card>
            </v-tab-item>

            <v-tab-item>
              <v-card tile>
                <v-list class="mt-2 pa-1" outlined>
                  <v-list-item v-for="(item,i) in notice"
                               :key="i" class="pa-0" :style="i != (notice.length - 1) ? 'border-bottom: 1px solid #eaeaea' :''">
                    <v-card-text>{{item.title}}</v-card-text>
                  </v-list-item>
                </v-list>
              </v-card>
            </v-tab-item>
          </v-tabs-items>
        </v-sheet>

      </div>
    </div>
</template>

<script>
    export default {
        name: "HomeContact",
      data: () => ({
        smTab:0,
        phoneNumber: '',
        email:'',
        name:'',
        title:'',
        content:'',
        notice: [
            {title:'단축 근무로 인한 통화 지연 안내 (문자 메모 부탁드립니다.)', content:'안녕하세요 고객님\n' +
                  '\n' +
                  '요즘 코로나 정국으로 항공환불이 지체되어 죄송스럽게 생각합니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '저희도 최대한 항공사들과 협의하여 조속하게 환불이 진행 될 수 있도록 최선을 다 하고 있습니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '항공사마다의 지침이 달라서 기본 3개월에서 6개월 이상 소요되는 경우도 있사오니 양해 말씀드리구요\n' +
                  '\n' +
                  '환입 즉시 고객분께 문자드려 계좌번호 받고 진행하고 있사오니 조금 더 기다려 주시면 감사하겠습니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '또한 요즘 코로나로 인하여 단축근무 또는 조기 퇴근하는 경우가 많아\n' +
                  '\n' +
                  '바로 바로 유선상 통화는 어려울 수 있습니다.\n' +
                  '\n' +
                  '그런 경우는\n' +
                  '회사번호 02-777-0655 번으로 문자남겨주시면 최대한 빨리 연락드리겠습니다.\n' +
                  '\n' +
                  '\n' +
                  '취소위약금은 계약당시 약관법에 따르고 있으며\n' +
                  '발권처 패널티 또는 항공패널티는 항공사마다 공지가 다르기 때문에 개별 문의 부탁드립니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '고객 여러분의 건강을 기원드립니다.', reg_date:'', reply_cnt: 2, view_cnt: 1818},
            {title:'에어모리셔스(MK항공) 바우쳐 (EMD) 발행 안내 건', content:'안녕하세요 고객님\n' +
                  '\n' +
                  '여행사랑 입니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '코로나로 인한 전격적인 여행입국제한조치로 인해 아름다운 추억을 남기고 공유할 수 있는 소중한 기회를 미루고 계신\n' +
                  '\n' +
                  '모든 고객분들께 위로의 말씀 드립니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '항공사,여행사,현지업체,현지호텔 모두 한시라도 빨리 모든 업무가 정상화되기를 기대하고 있습니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '물론 현재 모든 지역의 항공,호텔업이 일시 중지 상황이라 전지역에 대한 궁금증이 많으시겠지만\n' +
                  '\n' +
                  '우선 고객분들께서 가장 궁금해 하시는 에어모리셔스항공(이하 MK) 관련 공지 드립니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '현재 MK뿐만 아니라 전세계 모든 항공사들이 운항정지 상태이나 몇몇 지역으로부터 7월,8월 이후 재개 운항 소식이 들리고 있으며\n' +
                  '\n' +
                  '호텔들 또한 재개장 준비에 한창이며 이미 재오픈 공지한 호텔들도 많이 생기고 있습니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '다만 기존 항공발권 후 보류 또는 취소한 고객분들의 환불 문제가 여전히 존재하고 있는 상황이고\n' +
                  '\n' +
                  '각 항공사들마다의 기준이 제 각각이라 고객분들 뿐만 아니라 여행사 직원들 조차 어려움 및 다량의 컴플레인을 겪고 있습니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  'MK는 지난 3월말 입국제한으로 인한 고객환불건에 대한 모든 신청을 접수 받았으며\n' +
                  '\n' +
                  '5월말까지의 모든 출발고객분들에 대하여 환불 약속을 한 바 있습니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '*그러나 항공사의 법정관리가 들어감에따라 규정이 변경되면서 고객분들과 약속을 드렸던 3월~5월 출발팀 항공 환불건에 대해서도 사실상 무기한 연기가 된 상황입니다 (저희 회사의 경우 환불접수가 3월달에 MK항공에 접수가 다 완료된 상태입니다)\n' +
                  '\n' +
                  '하지만 항공사 법정관리체제에 따른 항공사 규정이 변경되었습니다 )\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '다만 여기서 고객분들과 오해가 생기고 혼선이 있으신 부분은\n' +
                  '\n' +
                  '환불진행의 주체, 즉 당사자는 MK 서울사무소 총판이 아니 현지 MK 본사 라는 부분입니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  'MK 서울사무소는 퍼시픽에어에이젼시(주) 라는 주식회사로서\n' +
                  '\n' +
                  'MK 뿐만 아니라 여러지역 항공사들의 한국발권 및 변경 업무를 돕고 있는 연락사무소의 역할를 하고 있다보니\n' +
                  '\n' +
                  '실질적인 환불자체에 대한 고유권한이 없습니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '따라서 고객이나 여행사 입장에서는 발권주최인 퍼시픽에어에이젼시(주)의 확실한 조처나 공문을 원하고 있는 입장이기는 하나\n' +
                  '\n' +
                  '4월말 MK 본사의 법정관리신청이 확정되면서 모든 공식적인 공지가 보류된 상황이며,\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '6월9일 재정리된 MK본사의 입장을 서울사무소에서 공식화하여 전달을 받아 아래와 같이 공지 드립니다.\n' +
                  '\n' +
                  '(MK항공의 공문이 없는 이유는 몇가지 정리되지 않은 사안 및 현재 코로나 19로 인한 항공사의 순환근무를 하는 서울사무소의 한계성 때문으로 보입니다.)\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '[위에 해당내용에 따른 최종 정리]\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '1. 기존 3월말에 환불신청된 모든 고객분들의 EMD 전환을 추천드립니다. (5월말까지 출발자 기준)\n' +
                  '\n' +
                  '참고로 EMD ( Electronic Miscellaneous Document ) 는 쉽게 말씀드려 유효기간이 있는 바우쳐 즉 상품권(TRAVEL VOUCHER)으로 인식하시면 됩니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  'EMD로 신청하시는 것이 유리한 이유는 현재 MK본사가 법정관리 진행중이라\n' +
                  '\n' +
                  '현금환불 신청만을 계속 기다리시는 경우 최소 2년정도 기간이 더소요되실 수 있으며 법정관리에 따른 기존 항공권 발행가보다 감액되어 환입을 받으실 수도 있다는 부분입니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '->어느정도 감액되는지는 현재까지 법정관리 절차완료가 되지않은 진행중이기 때문에 법정관리의 판결에 따라 진행될\n' +
                  '\n' +
                  '예정입니다 현재 항공사에서는 어느정도 감액되는 지에 대해 파악하기 어려운상황이며 여행사 역시 추측하기 어려운 부분입니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '각 담당분들의 안내에 따라 동의를 해 주시면 EMD신청 해 드리도록 하겠습니다', reg_date:'', reply_cnt: 2, view_cnt: 1818},
            {title:'믿을 수 있는 여행사, 정직한 여행사 - 허니문사랑에서 공지 드립니다.', content:'믿을 수 있는 여행사, 정직한 여행사 - 허니문사랑에서 공지드립니다.\n' +
                  '\n' +
                  '우선 저희 허니문사랑을 이용해 주시는 고객분들께 감사의 말씀 올립니다^^\n' +
                  '\n' +
                  '허니문사랑은 최고의 서비스를 지향하는 여행사로서 최근 일련의 크고 작은 여행사들의 먹튀 사건에 대해 애석한 마음을 금할 길이 없습니다.\n' +
                  '\n' +
                  '불과 얼마전 몇몇 여행사들의 상식에 어긋난 고의 부도 사건이나 경영난으로 인한 부도, 또한 최근의 몰디브 전문 여행사의 부도 및 태업으로 인한 고객분들의 충격과 손실은 참으로 가슴 아픈 일입니다.\n' +
                  '\n' +
                  '또한 이 틈을 타서 카페나 블로그에 상표도 등록되지 않은 현지 여행사들이 엄연히 불법적인 영업을 하고 있는 지금의 현실도 우려할 만한 상황입니다.\n' +
                  '따라서 저희 허니문사랑 (주)여행사랑은 평생의 한 번 뿐인 허니문여행을 계획하시는 고객분들께 다시 한 번 검증된 여행사를 이용해 주실 것을 권해 드리며 단지 저렴한 가격이나 사은품 등 끼워팔기에 현혹되어 더 큰 손해를 보시기 않기를 바라는 마음에 글을 올립니다.\n' +
                  '\n' +
                  '저희 허니문사랑은 정직한 여행을 모토로 여행 영업보증보험과 기획여행보증보험 가입은 물론, 각 제휴업체간 이행(지불)보증보험을 가입하고 있으며 항공 및 현지여행에 대하여 출발전 직불 체제로 모든 컨펌을 입금과 동시에 드리고 있습니다.\n' +
                  '따라서 여행상담시 계약서 및 여행약관을 꼼꼼히 이해하신 후 입금 부탁드리는 바 입니다.\n' +
                  '(모든 입출금은 주식회사명으로만 가능합니다.)\n' +
                  '\n' +
                  '\n' +
                  '다시 한 번 저희 허니문사랑을 이용해 주시는 고객분들의 믿음에 고개숙여 감사드리며\n' +
                  '항상~ 언제나 최선을 다한 서비스로 보답드릴 것을 약속드립니다.', reg_date:'', reply_cnt: 2, view_cnt: 1818},
           
            {title:'가루다인도네시아항공 (GA) 공지', content:'안녕하세요.\n' +
                  '가루다인도네시아항공입니다.\n' +
                  '\n' +
                  '\n' +
                  'COVID-19 사태의 여파로 인해 기존 항공권이 EMD VOUCHER로 환불이 이루어진 케이스 관련하여 공지드립니다.', reg_date:'', reply_cnt: 2, view_cnt: 1818},
            {title:' 싱가포르항공 (SQ) 운항 스케줄 안내 1월', content:'안녕하세요.\n' +
                  '\n' +
                  '싱가포르항공 운항 스케줄 및 Flight No. 변경 안내 드립니다.\n' +
                  '\n' +
                  '인천-싱가포르 구간 항공편이 2021년 1월부터 아래와 같이 일부 변경됩니다. (운항 요일 및 시간 동일)\n' +
                  '\n' +
                  '* SQ609/SQ600 -> SQ601/SQ600\n' +
                  '\n' +
                  '* SQ603/SQ602 -> SQ605/SQ606\n' +
                  '\n' +
                  '변경 또는 환불 문의 사항이 있을 시, 싱가포르항공 여객영업부로 연락하시기 바랍니다.\n' +
                  '\n' +
                  '\n' +
                  '\n' +
                  '감사합니다.', reg_date:'', reply_cnt: 2, view_cnt: 1818}
        ]
      }),
      methods: {
        phoneFormatter : function(){
          //let v = (e.target.value || '').replace(/[^0-9]/g, '').replace('-', '');
          let v = this.phoneNumber.replace(/[^0-9]/g, '');

          let res = ''

          if(v.length < 3) {
            res = v;
          } else {
            if(v.substr(0, 2) =='02') {

              if(v.length <= 5) {//02-123-5678
                res = v.substr(0, 2) + '-' + v.substr(2, 3)
              }
              else if(v.length > 5 && v.length <= 9) {//02-123-5678
                res = v.substr(0, 2) + '-' + v.substr(2, 3) + '-' + v.substr(5)
              }
              else if(v.length > 9) {//02-1234-5678
                res = v.substr(0, 2) + '-' + v.substr(2, 4) + '-' + v.substr(6)
              }

            } else {
              if(v.length < 8) {
                res = v
              }
              else if(v.length == 8)
              {
                res = v.substr(0, 4) + '-' + v.substr(4)
              }
              else if(v.length == 9)
              {
                res = v.substr(0, 3) + '-' + v.substr(3, 3) + '-' + v.substr(6)
              }
              else if(v.length == 10)
              {
                res = v.substr(0, 3) + '-' + v.substr(3, 3) + '-' + v.substr(6)
              }
              else if(v.length > 10) { //010-1234-5678
                res = v.substr(0, 3) + '-' + v.substr(3, 4) + '-' + v.substr(7)
              }
            }
          }
          this.phoneNumber = res;
        }
      }
    }
</script>

<style scoped>

</style>
