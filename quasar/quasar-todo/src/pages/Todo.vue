<template>
  <q-page class="bg-grey-3 column">
    <q-list class="bg-white" separator bordered>
      <q-item
        v-for="(task, index) in tasks"
        :key="task.id"
        @click="task.isDone = !task.isDone"
        :class="{ 'done bg-blue-1': task.isDone }"
        clickable
        v-ripple
      >
        <q-item-section avatar>
          <q-checkbox
            v-model="task.isDone"
            class="no-pointer-events"
            color="primary"
          />
        </q-item-section>
        <q-item-section>
          <q-item-label>{{ task.title }}</q-item-label>
        </q-item-section>
        <q-item-section side v-if="task.isDone">
          <q-btn
            flat
            round
            dense
            color="primary"
            icon="delete"
            @click.stop="onDelete(index)"
          ></q-btn>
        </q-item-section>
      </q-item>
    </q-list>
  </q-page>
</template>

<script lang="ts">
import { defineComponent, ref } from "vue";

export default defineComponent({
  name: "TodoPage",
  setup() {
    const tasks: any = ref([
      { id: 1, title: "test", isDone: true },
      { id: 2, title: "test 2", isDone: false },
    ]);
    // generate function for delete  by index

    return { tasks };
  },
  methods: {
    onDelete(index: number) {
      this.tasks.splice(index, 1);
    },
  },
});
</script>
<style lang="scss">
.done {
  .q-item__label {
    text-decoration: line-through;
    color: gray;
  }
}
</style>
