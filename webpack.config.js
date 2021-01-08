const webpack = require('webpack');
const path = require('path');

const RESOURCES_DIR = path.resolve(__dirname, 'resources');

const config = {
  entry: `${RESOURCES_DIR}/deps.js`,
  output: {
    path: RESOURCES_DIR
  }
};

module.exports = config;
