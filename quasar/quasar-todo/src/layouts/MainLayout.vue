<template>
  <q-layout view="lHh Lpr lFf">
    <q-header>
      <q-toolbar>
        <q-btn
          flat
          dense
          round
          icon="menu"
          aria-label="Menu"
          @click="toggleLeftDrawer"
        />
        <div>
          <div class="q-px-lg q-pt-xl q-mb-md">
            <div class="text-h3">Todo</div>
            <!-- use formattedString computed value -->
            <div class="text-subtitle1">{{ nowDate }}</div>
            <q-img
              src="../assets/header-image.webp"
              class="header-image absolute-top"
            ></q-img>
          </div>
        </div>
      </q-toolbar>
    </q-header>

    <q-drawer
      v-model="leftDrawerOpen"
      show-if-above
      :width="250"
      :breakpoint="600"
    >
      <q-scroll-area
        style="
          height: calc(100% - 192px);
          margin-top: 192px;
          border-right: 1px solid #ddd;
        "
      >
        <q-list padding>
          <q-item clickable v-ripple to="/">
            <q-item-section avatar>
              <q-icon name="list" />
            </q-item-section>
            <q-item-section> Todo </q-item-section>
          </q-item>

          <q-item clickable v-ripple to="/help">
            <q-item-section avatar>
              <q-icon name="help" />
            </q-item-section>
            <q-item-section> Help </q-item-section>
          </q-item>
        </q-list>
      </q-scroll-area>

      <q-img
        class="absolute-top"
        src="https://cdn.quasar.dev/img/material.png"
        style="height: 192px"
      >
        <div class="absolute-bottom bg-transparent">
          <q-avatar size="56px" class="q-mb-sm">
            <img
              src="https://media.licdn.com/dms/image/D4E03AQEveo0wHQME5Q/profile-displayphoto-shrink_200_200/0/1665783579729?e=1705536000&v=beta&t=hpKBkA96uCJEFEkoxgDUVk6mKXWE0DWEplWN-WH_I-c"
            />
          </q-avatar>
          <div class="text-weight-bold">Raul Jonatan</div>
          <div>@Julnarot</div>
        </div>
      </q-img>
    </q-drawer>
    <q-page-container>
      <keep-alive>
        <router-view />
      </keep-alive>
    </q-page-container>
  </q-layout>
</template>

<script lang="ts">
import { defineComponent, ref } from "vue";
import EssentialLink from "components/EssentialLink.vue";
import { date } from "quasar";

const linksList = [
  {
    title: "Docs",
    caption: "quasar.dev",
    icon: "school",
    link: "https://quasar.dev",
  },
];

export default defineComponent({
  name: "MainLayout",

  components: {
    EssentialLink,
  },

  setup() {
    const leftDrawerOpen = ref(false);
    const nowDate = date.formatDate(new Date(), "YYYY-MM-DDTHH:mm:ss.SSSZ");

    return {
      essentialLinks: linksList,
      leftDrawerOpen,
      nowDate,
      toggleLeftDrawer() {
        leftDrawerOpen.value = !leftDrawerOpen.value;
      },
    };
  },
});
</script>

<style>
.header-image {
  height: 100%;
  z-index: -1;
  opacity: 0.2;
  filter: grayscale(100%);
}
</style>
