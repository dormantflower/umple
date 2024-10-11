import commonjs from '@rollup/plugin-commonjs';
import resolve from '@rollup/plugin-node-resolve';

export default {
  input: [
    "./editor.mjs"
    ],
  output: {
    file: "./editor.bundle.js",
    format: "iife",
    name: "cm6"
  },
  plugins: [
    resolve({
      extensions: ['.mjs']
    }),
    commonjs()
  ]
}
