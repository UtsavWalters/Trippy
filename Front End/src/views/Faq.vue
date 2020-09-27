<template>
  <div class="wrapper">
    <parallax class="section page-header header-filter" :style="headerStyle">
      <div class="container">
        <div class="md-layout">
          <div
            class="md-layout-item md-size-50 md-small-size-70 md-xsmall-size-100"
          >
            <h1 class="title">Frequently Asked Questions</h1>

            <br />
          </div>
        </div>
      </div>
    </parallax>
    <div class="main main-raised">
      <div class="section">
        <div class="container">
          <div class="md-layout">
            <div
              class="md-layout-item md-size-66 md-xsmall-size-100 mx-auto text-center"
            >
              <h2 class="title text-center">Frequently Asked Questions</h2>
            </div>
            <div
              class="md-layout-item md-size-66 md-xsmall-size-100 mx-auto text-center"
            >
              <md-field class="md-form-group" slot="inputs">
                <md-icon>add</md-icon>
                <label>NEW FAQ</label>
                <md-input v-model="faq" type="faq"></md-input>
              </md-field>
            </div>

            <div
              class="md-layout-item md-size-66 md-xsmall-size-100 mx-auto text-center"
            >
              <h5 class="description">
               {{faq}}
              </h5>
              <h5 class="description">
                FAQ #2
                ****************************************************************
              </h5>
              <h5 class="description">
                FAQ #3
                ****************************************************************
              </h5>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  bodyClass: "FAQ_page-page",
  props: {
    header: {
      type: String,
      default: require("@/assets/img/bg3.jpg"),
    },
  },
  data() {
    return {
      name: null,
      email: null,
      message: null,
      faq: "",
      
    };
  },
  computed: {
    headerStyle() {
      return {
        backgroundImage: `url(${this.header})`,
      };
    },
  },
};
</script>

<style lang="scss" scoped>
.md-card-actions.text-center {
  display: flex;
  justify-content: center !important;
}
.contact-form {
  margin-top: 30px;
}

.md-has-textarea + .md-layout {
  margin-top: 15px;
}
</style>
